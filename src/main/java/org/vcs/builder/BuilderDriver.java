package org.vcs.builder;

public class BuilderDriver {
    public static void main(String[] args) {
       Computer computer=new Computer.ComputerBuilder(1,8,4).setDvdPlayer(true).build();


    }
}
