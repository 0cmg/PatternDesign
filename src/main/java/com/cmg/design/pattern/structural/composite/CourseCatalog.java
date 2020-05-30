package com.cmg.design.pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName CourseCatalog
 * @Author cmg
 * @Date 2020/5/30 14:38
 * @Description TODO
 **/
public class CourseCatalog extends CatalogComponent {
    private List<CatalogComponent> items = new ArrayList<CatalogComponent>();
    private String name;
    private Integer level;

    public CourseCatalog(String name,Integer level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(CatalogComponent catalogComponent) {
        items.add(catalogComponent);
    }

    @Override
    public void remove(CatalogComponent catalogComponent) {
        items.remove(catalogComponent);
    }

    @Override
    public String getName(CatalogComponent catalogComponent) {
        return this.name;
    }

    @Override
    public void print() {
        System.out.println(this.name);
        for(CatalogComponent catalogComponent : items){
            for(int i=0;i<level;i++){
                System.out.print(" ");
            }
            catalogComponent.print();
        }
    }
}
