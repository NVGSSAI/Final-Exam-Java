/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question11;

import java.util.Objects;

/**
 *
 * @author Venkata Gopi Siva Sai Nallapati
 */
public class TvCompanies {
private String tvName;
private int tvPrice;

    public TvCompanies(String tvName, int tvPrice) {
        this.tvName = tvName;
        this.tvPrice = tvPrice;
    }


    public String getTvName() {
        return tvName;
    }

    public void setTvName(String tvName) {
        this.tvName = tvName;
    }

    public int getTvPrice() {
        return tvPrice;
    }

    public void setTvPrice(int tvPrice) {
        this.tvPrice = tvPrice;
    }

    @Override
    public String toString() {
        return "TvCompanies{" + "tvName=" + tvName + ", tvPrice=" + tvPrice + '}';
    }
    
    /*
    *  For every object created in this class it returns hashcode.
    */
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.tvName);
        hash = 79 * hash + this.tvPrice;
        return hash;
    }
    /*
    * Takes object as parameter which is used for comparing this class objects
    * if two objects have same values for metioned attributes  then hash code is equal.
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TvCompanies other = (TvCompanies) obj;
        if (this.tvPrice != other.tvPrice) {
            return false;
        }
        if (!Objects.equals(this.tvName, other.tvName)) {
            return false;
        }
        return true;
    }

}
