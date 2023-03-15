package com.bootcoing.dsa.classesObjects;

public class Application {
    public static void main(String[] args) {


        Faculty faculty = new Faculty();
        Projector projector = new Projector();
        faculty.startProjector(projector.toString());
        faculty.stopProjector(projector);
        faculty.removeProjector(new Projector[]{projector});

    }
}