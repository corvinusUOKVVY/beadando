package hu.corvinus.beadando.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class BeadandoSzoveg {

    private final String szoveg;

    public String getSzoveg() {
        return szoveg;
    }

    private BeadandoSzoveg(Builder builder) {
        this.szoveg = builder.szoveg;
    }

    public static class Builder{

        private String szoveg;

        public Builder szoveg(final String szoveg){
            this.szoveg = szoveg;
            return this;
        }
        public BeadandoSzoveg build(){
            return new BeadandoSzoveg(this);
        }
    }
}
