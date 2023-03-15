package com.bootcoing.dsa.classesObjects;

public class Faculty {
    public String name;
    public void startProjector(String name){
        System.out.println("Projector started");
    }
    public void stopProjector(Projector proj2 ){
        System.out.println("Projector stopped");
    }
    public void removeProjector(Projector[] projectors){
        System.out.println("Projectors removed");
        int a[]= new int[2];
        a[0]=10;
        a[1]=20;
        Projector[] p = new Projector[5];
        for (int i = 0; i < p.length; i++){
            Projector ps = new Projector();
            ps.name = "projector" + i;
            p[i] = ps;
        }
    }
}
