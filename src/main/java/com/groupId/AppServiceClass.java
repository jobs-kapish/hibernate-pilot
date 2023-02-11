package com.groupId;

import com.groupId.entities.Material;
import com.groupId.entities.Product;
import com.groupId.entities.SofaTable;
import com.groupId.entities.enums.ProductCategory;
import com.groupId.entities.enums.UnitsEnum;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppServiceClass {

    public void function() {
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
        }

    }
}
