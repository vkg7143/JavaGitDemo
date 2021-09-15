package org.vcs.builder;

public class Computer {
    int HDD;
    int ram;

    public int getHDD() {
        return HDD;
    }

    public void setHDD(int HDD) {
        this.HDD = HDD;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getCpu() {
        return cpu;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    public boolean isExternalGrapic() {
        return isExternalGrapic;
    }

    public void setExternalGrapic(boolean externalGrapic) {
        isExternalGrapic = externalGrapic;
    }

    public boolean isDvdPlayer() {
        return isDvdPlayer;
    }

    public void setDvdPlayer(boolean dvdPlayer) {
        isDvdPlayer = dvdPlayer;
    }

    int cpu;
    boolean isExternalGrapic;
    boolean isDvdPlayer;

    public Computer(ComputerBuilder cB) {
        this.HDD = cB.HDD;
        this.ram = cB.ram;
        this.cpu = cB.cpu;
        this.isExternalGrapic = cB.isExternalGrapic;
        this.isDvdPlayer = cB.isDvdPlayer;
    }

    public static class ComputerBuilder {
        private int HDD;
        private int ram;
        private int cpu;

        // optional parameters
        private boolean isExternalGrapic;
        private boolean isDvdPlayer;

        public ComputerBuilder(int HDD, int ram, int cpu) {
            this.HDD = HDD;
            this.ram = ram;
            this.cpu = cpu;
        }

        public boolean isExternalGrapic() {
            return isExternalGrapic;
        }

        public ComputerBuilder setExternalGrapic(boolean externalGrapic) {
            this.isExternalGrapic = externalGrapic;
            return this;
        }

        public boolean isDvdPlayer() {
            return isDvdPlayer;
        }

        public ComputerBuilder setDvdPlayer(boolean dvdPlayer) {
            this.isDvdPlayer = dvdPlayer;
            return this;
        }
        public Computer build(){
            return new Computer(this);
        }
    }
}


