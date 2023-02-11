package com.groupId;


import com.groupId.entities.*;
import com.groupId.entities.enums.DeptEnum;
import com.groupId.entities.enums.ProductCategory;
import com.groupId.entities.enums.Role;
import com.groupId.entities.enums.UnitsEnum;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//@SpringBootApplication
public class Application {

    public static void main(String[] s) {
        /*String configFilePath = "com/groupId/hibernate.cfg.xml";
         *//*//*Users/macbook/IdeaProjects/HibernatePilot/src/main/java*//*
        configFilePath = "/Users/macbook/IdeaProjects/HibernatePilot/src/main/java/hibernate.cfg.xml";*/
//        SpringApplication.run(Application.class, s);
        SessionFactory factory = null;
        try {
            factory = new Configuration().configure().buildSessionFactory();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        Session session = factory.openSession();
        System.out.print("Hello");
        Transaction transaction = session.beginTransaction();

        Address factoryAddress = new Address("B-87,Timber Market,Kirti Nagar", "Delhi", 110015l);
        //persisting users
        User santosh = new User("Santosh", "", "Singh", "", 9621467727l, factoryAddress, Role.EMPLOYEE);
        User pandit = new User("Pandit", "", "Sharma", "email@gmail.com", 9871562984l, factoryAddress, Role.EMPLOYEE);
        session.persist(santosh);
        session.persist(pandit);

        //persisting departments
        Department polishDept = new Department(DeptEnum.POLISH);
        Department upholstryDept = new Department(DeptEnum.UPHOLSTRY);
        Department helperDept = new Department(DeptEnum.HELPER);
        Department carpenterDept = new Department(DeptEnum.CARPENTER);
        session.persist(polishDept);
        session.persist(upholstryDept);
        session.persist(helperDept);
        session.persist(carpenterDept);

        /*List<Department> departments = new ArrayList<>();
        departments.add(polishDept);
        departments.add(upholstryDept);
        departments.add(helperDept);
        departments.add(carpenterDept);*/

        //persisting Employees
        Employee santoshEmp = new Employee(santosh.getId(), true, Employee.Type.PER_DAY_BASIS, -1, 450);
        santoshEmp.getDepartments().add(polishDept);
        polishDept.getEmpList().add(santoshEmp);

        santoshEmp.getDepartments().add(helperDept);
        helperDept.getEmpList().add(santoshEmp);
        session.persist(santoshEmp);

        Employee panditEmp = new Employee(pandit.getId(), true, Employee.Type.PER_DAY_BASIS, -1, 400);
        panditEmp.getDepartments().add(polishDept);
        polishDept.getEmpList().add(panditEmp);
        session.persist(panditEmp);

//        >>>>>>>>>>>>>>>>>>>>Product and material<<<<<<<<<<<<<<<<<


        List<Material> materialsForSf1 = new ArrayList<>();
        //carpentary,Painters
        //upholstry
        Material foamMattress = new Material("mattress", 22, 21, 4, UnitsEnum.INCHES, new Date());
        Material Foam1Inch = new Material("foam", 34, 78, 1.5f, UnitsEnum.INCHES, new Date());
        Material nirmalCloth = new Material("nirmalCloth", 34, 78, 0.2f, UnitsEnum.METRE, new Date());
        materialsForSf1.add(foamMattress);
        materialsForSf1.add(Foam1Inch);
        materialsForSf1.add(nirmalCloth);

        Product sofa1 = new Product(ProductCategory.SOFA, materialsForSf1);

        for (Material eachMaterial : materialsForSf1) {
            eachMaterial.setProduct(sofa1);
            session.persist(eachMaterial);
        }

        session.persist(sofa1);
//      Todo : Add qty. in material pojo
        List<Material> materialsForBd1 = new ArrayList<>();
        Material ply12mm = new Material("Ply", 6.5f, 3, 18, UnitsEnum.FOOT, new Date());
        Material ply18mm = new Material("Ply", 2.5f, 6.5f, 12, UnitsEnum.FOOT, new Date());
        nirmalCloth = new Material("nirmalCloth", 34, 78, 0.2f, UnitsEnum.METRE, new Date());

        materialsForBd1.add(ply12mm);
        materialsForBd1.add(ply18mm);
        materialsForBd1.add(nirmalCloth);

        Product bd1 = new Product(ProductCategory.BED, materialsForBd1);

        for (Material eachMaterial : materialsForBd1) {
            session.persist(eachMaterial);
            eachMaterial.setProduct(bd1);
        }
        session.persist(bd1);
//        >>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<
        transaction.commit();
        session.close();
        factory.close();


        //fetching the data from database

    }

    private static Department[] inItDepts() {

        Department[] deptArr = new Department[4];
        deptArr[0] = new Department(DeptEnum.POLISH);
        deptArr[1] = new Department(DeptEnum.UPHOLSTRY);
        deptArr[2] = new Department(DeptEnum.HELPER);
        deptArr[3] = new Department(DeptEnum.CARPENTER);

        return deptArr;
    }

    private static Department fetchDept(Department[] deptArr, DeptEnum deptEnum) {
        for (Department each : deptArr) {
            if (each.getDeptName() == deptEnum) {
                return each;
            }
        }
        return null;
    }


    private void testCode() {
        /*>>>>>>>>>>>>>>>>TESTING>>>>>>>>>>>>>>>>*/
        /*User1 testUser = new User1();
        testUser.setName("Kapish");

        Vehicle v1 = new Vehicle();
        v1.setName("car");
        Vehicle v2 = new Vehicle();
        v2.setName("Jeep");

        Vehicle v3 = new Vehicle();
        v3.setName("Spark");

        testUser.getVehicles().add(v1);
        testUser.getVehicles().add(v2);
        testUser.getVehicles().add(v3);


        User1 testUser2 = new User1();
        testUser2.setName("Chandy");

        v1 = new Vehicle();
        v1.setName("Baleno");
        v2 = new Vehicle();
        v2.setName("Jeep");

        testUser2.getVehicles().add(v1);
        testUser2.getVehicles().add(v2);

        session.persist(testUser);
        session.persist(testUser2);*/
        /*>>>>>>>>>>>>>>>>TESTING OVER>>>>>>>>>>>>>>>>*/
    }

}
