
package modelo;

public class Formula {
    
    
    private double  ureaK, dapK, mapK, kclK, kmagK, fosfoK, potasioK, amonioK;
    private double  n, p, k, s, mg;
    private double  totalKilos, totalN, totalP, totalK, totalS, totalMg, totalKmezcla;
    private double  kilosUrea, kilosDap, kilosMap, kilosKcl, kilosKmag, kilosFosfo, kilosPotasio, kilosAmonio;
    private double  nitrogeno, fosforo, potasio, azufre, magnesio;
    private double  precioMezcla, precioUrea, precioDap, precioMap, precioKmag, precioKcl, precioFosfo, precioPotasio, precioAmonio;
    private double  precioTotal, precioToneladas;
    private Conexion conexion;
    
    public Formula(Conexion conexion) {
        
        this.n = 0;
        this.p = 0;
        this.k = 0;
        this.s = 0;
        this.mg = 0;
        this.totalKilos = 0;
        this.totalN = 0;
        this.totalP = 0;
        this.totalK = 0;
        this.totalS = 0;
        this.totalMg = 0;
        this.totalKmezcla = 0;
        this.kilosUrea = 0;
        this.kilosDap = 0;
        this.kilosMap = 0;
        this.kilosKcl = 0;
        this.kilosKmag = 0;
        this.kilosFosfo = 0;
        this.kilosPotasio = 0;
        this.kilosAmonio = 0;
        this.ureaK = 0;
        this.dapK = 0;
        this.mapK = 0;
        this.kclK = 0;
        this.kmagK = 0;
        this.fosfoK = 0;
        this.potasioK = 0;
        this.amonioK = 0;
        this.nitrogeno = 0;
        this.fosforo = 0;
        this.potasio = 0;
        this.azufre = 0;
        this.magnesio = 0;
        this.precioMezcla = 0;
        this.precioUrea = 0;
        this.precioDap = 0;
        this.precioMap = 0;
        this.precioKmag = 0;
        this.precioKcl = 0;
        this.precioFosfo = 0;
        this.precioPotasio = 0;
        this.precioAmonio = 0;
        this.precioTotal = 0;
        this.precioToneladas = 0;
        this.conexion = conexion;
    }

    public Conexion getConexion() {
        return conexion;
    }

    public void setConexion(Conexion conexion) {
        this.conexion = conexion;
    }
    
    public double getN() {
        return n;
    }

    public void setN(double n) {
        this.n = n;
    }

    public double getP() {
        return p;
    }

    public void setP(double p) {
        this.p = p;
    }

    public double getK() {
        return k;
    }

    public void setK(double k) {
        this.k = k;
    }

    public double getS() {
        return s;
    }

    public void setS(double s) {
        this.s = s;
    }

    public double getMg() {
        return mg;
    }

    public void setMg(double mg) {
        this.mg = mg;
    }

    public double getTotalKilos() {
        return totalKilos;
    }

    public void setTotalKilos(double totalKilos) {
        this.totalKilos = totalKilos;
    }

    public double getTotalN() {
        return totalN;
    }

    public void setTotalN(double totalN) {
        this.totalN = totalN;
    }

    public double getTotalP() {
        return totalP;
    }

    public void setTotalP(double totalP) {
        this.totalP = totalP;
    }

    public double getTotalK() {
        return totalK;
    }

    public void setTotalK(double totalK) {
        this.totalK = totalK;
    }

    public double getTotalS() {
        return totalS;
    }

    public void setTotalS(double totalS) {
        this.totalS = totalS;
    }

    public double getTotalMg() {
        return totalMg;
    }

    public void setTotalMg(double totalMg) {
        this.totalMg = totalMg;
    }

    public double getTotalKmezcla() {
        return totalKmezcla;
    }

    public void setTotalKmezcla(double totalKmezcla) {
        this.totalKmezcla = totalKmezcla;
    }

    public double getKilosUrea() {
        return kilosUrea;
    }

    public void setKilosUrea(double kilosUrea) {
        this.kilosUrea = kilosUrea;
    }

    public double getKilosDap() {
        return kilosDap;
    }

    public void setKilosDap(double kilosDap) {
        this.kilosDap = kilosDap;
    }

    public double getKilosMap() {
        return kilosMap;
    }

    public void setKilosMap(double kilosMap) {
        this.kilosMap = kilosMap;
    }

    public double getKilosKcl() {
        return kilosKcl;
    }

    public void setKilosKcl(double kilosKcl) {
        this.kilosKcl = kilosKcl;
    }

    public double getKilosKmag() {
        return kilosKmag;
    }

    public void setKilosKmag(double kilosKmag) {
        this.kilosKmag = kilosKmag;
    }

    public double getKilosFosfo() {
        return kilosFosfo;
    }

    public void setKilosFosfo(double kilosFosfo) {
        this.kilosFosfo = kilosFosfo;
    }

    public double getKilosPotasio() {
        return kilosPotasio;
    }

    public void setKilosPotasio(double kilosPotasio) {
        this.kilosPotasio = kilosPotasio;
    }

    public double getKilosAmonio() {
        return kilosAmonio;
    }

    public void setKilosAmonio(double kilosAmonio) {
        this.kilosAmonio = kilosAmonio;
    }

    public double getUreaK() {
        return ureaK;
    }

    public void setUreaK(double ureaK) {
        this.ureaK = ureaK;
    }

    public double getDapK() {
        return dapK;
    }

    public void setDapK(double dapK) {
        this.dapK = dapK;
    }

    public double getMapK() {
        return mapK;
    }

    public void setMapK(double mapK) {
        this.mapK = mapK;
    }

    public double getKclK() {
        return kclK;
    }

    public void setKclK(double kclK) {
        this.kclK = kclK;
    }

    public double getKmagK() {
        return kmagK;
    }

    public void setKmagK(double kmagK) {
        this.kmagK = kmagK;
    }

    public double getFosfoK() {
        return fosfoK;
    }

    public void setFosfoK(double fosfoK) {
        this.fosfoK = fosfoK;
    }

    public double getPotasioK() {
        return potasioK;
    }

    public void setPotasioK(double potasioK) {
        this.potasioK = potasioK;
    }

    public double getAmonioK() {
        return amonioK;
    }

    public void setAmonioK(double amonioK) {
        this.amonioK = amonioK;
    }

    public double getNitrogeno() {
        return nitrogeno;
    }

    public void setNitrogeno(double nitrogeno) {
        this.nitrogeno = nitrogeno;
    }

    public double getFosforo() {
        return fosforo;
    }

    public void setFosforo(double fosforo) {
        this.fosforo = fosforo;
    }

    public double getPotasio() {
        return potasio;
    }

    public void setPotasio(double potasio) {
        this.potasio = potasio;
    }

    public double getAzufre() {
        return azufre;
    }

    public void setAzufre(double azufre) {
        this.azufre = azufre;
    }

    public double getMagnesio() {
        return magnesio;
    }

    public void setMagnesio(double magnesio) {
        this.magnesio = magnesio;
    }

    public double getPrecioMezcla() {
        return precioMezcla;
    }

    public void setPrecioMezcla(double precioMezcla) {
        this.precioMezcla = precioMezcla;
    }

    public double getPrecioUrea() {
        return precioUrea;
    }

    public void setPrecioUrea(double precioUrea) {
        this.precioUrea = precioUrea;
    }

    public double getPrecioDap() {
        return precioDap;
    }

    public void setPrecioDap(double precioDap) {
        this.precioDap = precioDap;
    }

    public double getPrecioMap() {
        return precioMap;
    }

    public void setPrecioMap(double precioMap) {
        this.precioMap = precioMap;
    }

    public double getPrecioKmag() {
        return precioKmag;
    }

    public void setPrecioKmag(double precioKmag) {
        this.precioKmag = precioKmag;
    }

    public double getPrecioKcl() {
        return precioKcl;
    }

    public void setPrecioKcl(double precioKcl) {
        this.precioKcl = precioKcl;
    }

    public double getPrecioFosfo() {
        return precioFosfo;
    }

    public void setPrecioFosfo(double precioFosfo) {
        this.precioFosfo = precioFosfo;
    }

    public double getPrecioPotasio() {
        return precioPotasio;
    }

    public void setPrecioPotasio(double precioPotasio) {
        this.precioPotasio = precioPotasio;
    }

    public double getPrecioAmonio() {
        return precioAmonio;
    }

    public void setPrecioAmonio(double precioAmonio) {
        this.precioAmonio = precioAmonio;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public double getPrecioToneladas() {
        return precioToneladas;
    }

    public void setPrecioToneladas(double precioToneladas) {
        this.precioToneladas = precioToneladas;
    }
    
    
    
   
    
    
    public double ureaNitro() {
        
        n = ureaK * 46 / 100;
        
        return n;
    }
    
    public double dapNitro() {
        
        n = dapK * 18 / 100;
        
        return n;
        
    }
    
    public double dapFosforo() {
        
        p = dapK * 46 / 100;
        
        return p;
        
    }
    
    public double mapNitro() {
        
        n = mapK * 10 / 100;
        
        return n;
        
    }
    
    public double mapFosforo() {
        
        p = mapK * 50 / 100;
        
        return p;
        
    }
    
    public double kclPotasio() {
        
        k = kclK * 60 / 100;
        
        return k;
        
    }
    
    public double kmagPotasio() {
        
        k = kmagK * 22 / 100;
        
        return k;
        
    }
    
    public double kmagAzufre() {
        
        s = kmagK * 11 / 100;
        
        return s;
        
    }
    
    public double kmagMagnesio() {
        
        mg = kmagK * 22 / 100;
        
        return mg;
        
    }
    
    public double fosfoNitro() {
        
        n = fosfoK * 33 / 100;
        
        return n;
        
    }
    
    public double potasioPotasio() {
        
        k = potasioK * 50 / 100;
        
        return k;
        
    }
    
    public double amonioNitro() {
        
        n = amonioK * 22 / 100;
        
        return n;
        
    }
    
    public double amonioAzufre() {
        
        s = amonioK * 24 / 100;
        
        return s;
        
    }
    
    public double sumaKilosCalculo() {
        
        totalKilos = ureaK + dapK + mapK + kclK + kmagK + fosfoK + potasioK + amonioK;
        
        return totalKilos;
        
    }
    
    public double sumaKilosMezcla() {
        
        totalKmezcla = kilosUrea + kilosDap + kilosMap + kilosKcl + kilosKmag + kilosFosfo + kilosPotasio + kilosAmonio;
        
        return totalKmezcla;
        
    }
    
    public double sumaNitrogeno(double urea, double dap, double map, double fosfo, double amonio) {
        
        totalN = urea + dap + map + fosfo + amonio;
        
        return totalN;
        
    }
    
    public double sumaFosforo(double dap, double map) {
        
        totalP = dap + map;
        
        return totalP;
        
    }
    
    public double sumaPotasio(double kcl, double kmag, double potasio) {
        
        totalK = kcl + kmag + potasio;
        
        return totalK;
        
    }
    
    public double sumaAzufre(double kmag, double amonio) {
        
        totalS = kmag + amonio;
        
        return totalS;
        
    }
    
    public double sumaMagenesio(double kmag) {
        
        totalMg = kmag;
        
        return totalMg;
        
    }
    
    public double kilosUreaMezcla() {
      
        if(!(totalKilos == 0)) {
            
            kilosUrea = ureaK * 1000 / totalKilos;
        
        } else {
            
            kilosUrea = 0;
            
        }
        
        return kilosUrea;
        
    }
    
    public void cleanFields () {
        this.n = 0;
        this.p = 0;
        this.k = 0;
        this.s = 0;
        this.mg = 0;
        this.totalKilos = 0;
        this.totalN = 0;
        this.totalP = 0;
        this.totalK = 0;
        this.totalS = 0;
        this.totalMg = 0;
        this.totalKmezcla = 0;
        this.kilosUrea = 0;
        this.kilosDap = 0;
        this.kilosMap = 0;
        this.kilosKcl = 0;
        this.kilosKmag = 0;
        this.kilosFosfo = 0;
        this.kilosPotasio = 0;
        this.kilosAmonio = 0;
        this.ureaK = 0;
        this.dapK = 0;
        this.mapK = 0;
        this.kclK = 0;
        this.kmagK = 0;
        this.fosfoK = 0;
        this.potasioK = 0;
        this.amonioK = 0;
        this.nitrogeno = 0;
        this.fosforo = 0;
        this.potasio = 0;
        this.azufre = 0;
        this.magnesio = 0;
        this.precioMezcla = 0;
        this.precioUrea = 0;
        this.precioDap = 0;
        this.precioMap = 0;
        this.precioKmag = 0;
        this.precioKcl = 0;
        this.precioFosfo = 0;
        this.precioPotasio = 0;
        this.precioAmonio = 0;
        this.precioTotal = 0;
        this.precioToneladas = 0;
    }
    
    public double kilosDapMezcla() {
       
        if(!(totalKilos == 0)) {
            
            kilosDap = dapK * 1000 / totalKilos;
        
        } else {
            
            kilosDap = 0;
            
        }
        
        return kilosDap;
        
    }
    
    public double kilosMapMezcla() {
        
        if(!(totalKilos == 0)) {
       
            kilosMap = mapK * 1000 / totalKilos;
        
        } else {
            
            kilosMap = 0;
            
        }
        
        return kilosMap;
        
    }
    
    public double kilosKclMezcla() {
        
        if(!(totalKilos == 0)) {
        
            kilosKcl = kclK * 1000 / totalKilos;
        
        } else {
            
            kilosKcl = 0;
            
        }
        
        return kilosKcl;
        
    }
    
    public double kilosKmagMezcla() {
        
        if(!(totalKilos == 0)) {
        
            kilosKmag = kmagK * 1000 / totalKilos;
        
        } else {
            
            kilosKmag = 0;
            
        }
        
        return kilosKmag;
        
    }
    
    public double kilosFosfoMezcla() {
        
        if(!(totalKilos == 0)) {
        
            kilosFosfo = fosfoK * 1000 / totalKilos;
        
        } else {
            
            kilosFosfo = 0;
            
        }
        
        return kilosFosfo;
        
    }
    
     public double kilosPotasioMezcla() {
        
        if(!(totalKilos == 0)) {
        
            kilosPotasio = potasioK * 1000 / totalKilos;
        
        } else {
            
            kilosPotasio = 0;
            
        }
        
        return kilosPotasio;
        
    }
     
     public double kilosAmonioMezcla() {
        
        if(!(totalKilos == 0)) {
        
            kilosAmonio = amonioK * 1000 / totalKilos;
        
        } else {
            
            kilosAmonio = 0;
            
        }
        
        return kilosAmonio;
        
    }    
    
    public double formulaNitrogeno() {
        
        nitrogeno = totalN / 10;
        
        return nitrogeno;
        
    }
    
    public double formulaFosforo() {
        
        fosforo = totalP / 10;
        
        return fosforo;
        
    }
    
    public double formulaPotasio () {
        
        potasio = totalK / 10;
        
        return potasio;
        
    }
    
    public double formulaAzufre () {
        
        azufre = totalS / 10;
        
        return azufre;
        
    }
    
    public double formulaMagnesio () {
        
        magnesio = totalMg / 10;
        
        return magnesio;
        
    }
    
    public double precioUrea (double precio) {
        
       precioUrea = kilosUrea * precio;
       
       return precioUrea;
        
    }
    
    public double precioDap (double precio) {
        
       precioDap = kilosDap * precio;
       
       return precioDap;
        
    }
    
    public double precioMap (double precio) {
        
       precioMap = kilosMap * precio;
       
       return precioMap;
        
    }
    
    public double precioKcl (double precio) {
        
       precioKcl = kilosKcl * precio;
       
       return precioKcl;
        
    }
    
    public double precioKmag (double precio) {
        
       precioKmag = kilosKmag * precio;
       
       return precioKmag;
        
    }
    
    public double precioFosfo (double precio) {
        
       precioFosfo = kilosFosfo * precio;
       
       return precioFosfo;
        
    }
    
    public double precioPotasio (double precio) {
        
       precioPotasio = kilosPotasio * precio;
       
       return precioPotasio;
        
    }
    
    public double precioAmonio (double precio) {
        
       precioAmonio = kilosAmonio * precio;
       
       return precioAmonio;
        
    }
    
    public double sumaPrecio() {
        
        precioMezcla = precioUrea + precioDap + precioMap + precioKcl + precioKmag + precioFosfo + precioPotasio + precioAmonio;
        
        return precioMezcla;
        
    }
    
    public double precioTotal(double maniobras) {
        
        precioTotal = precioMezcla + maniobras;
        
        return precioTotal;
        
    }
    
    public double precioTotalTm(double toneladas) {
        
        precioToneladas = precioTotal * toneladas;
        
        return precioToneladas;
        
    }
    
}
