
public class PersegiPanjang extends Datar{
    double luas,keliling,p,l;
    
    @Override
    double luas(){
        double luas = p*l;
        System.out.println("luasnya adalah "+luas);
        return luas;
    }
    
    double keliling(){
        double keliling = 4*(p+l);
        System.out.println("keliling adalah "+keliling);
        return keliling;
    }
}
