package ru.dinar.patterns.creational.builder;

/**
 * created: 05-04-2022 - 16:30
 * project: patterns
 *
 * @author dinar
 * @version v0.1
 */
public class Triangle {

    private int aSide;
    private int bSide;
    private int cSide;

    private Triangle(int aSide, int bSide, int cSide) {
        this.aSide = aSide;
        this.bSide = bSide;
        this.cSide = cSide;
    }


    static class Builder {

        private int aSide;
        private int bSide;
        private int cSide;

        public Builder aSide(int aSide) {
            this.aSide = aSide;
            return this;
        }

        public Builder bSide(int bSide) {
            this.bSide = bSide;
            return this;
        }

        public Builder cSide(int cSide) {
            this.cSide = cSide;
            return this;
        }

        public Triangle build() {
            return new Triangle(aSide, bSide, cSide);
        }

    }


    static Builder builder() {
        return new Builder();
    }

    public void print() {
        System.out.println(aSide);
        System.out.println(bSide);
        System.out.println(cSide);
    }

}
