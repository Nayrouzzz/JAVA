/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyramids;

/**
 *
 * @author Nayrouz
 */
public class pyramids {
    String Pharaoh,AncientName ,ModernName ;
    int Dynasty ;
    String Site ;
    double Base1 , Base2 ,Height ;

    public pyramids(String Pharaoh, String AncientName, String ModernName, int Dynasty, String Site, double Base1, double Base2, double Height) {
        this.Pharaoh = Pharaoh;
        this.AncientName = AncientName;
        this.ModernName = ModernName;
        this.Dynasty = Dynasty;
        this.Site = Site;
        this.Base1 = Base1;
        this.Base2 = Base2;
        this.Height = Height;
    }

    @Override
    public String toString() {
        return "pyramids{" + "Pharaoh=" + Pharaoh + ", AncientName=" + AncientName + ", ModernName=" + ModernName + ", Dynasty=" + Dynasty + ", Site=" + Site + ", Base1=" + Base1 + ", Base2=" + Base2 + ", Height=" + Height + '}';
    }

    public String getPharaoh() {
        return Pharaoh;
    }

    public String getAncientName() {
        return AncientName;
    }

    public String getModernName() {
        return ModernName;
    }

    public int getDynasty() {
        return Dynasty;
    }

    public String getSite() {
        return Site;
    }

   
    


}
    
    
    
    
    
    

