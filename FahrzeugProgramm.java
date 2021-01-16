class FahrzeugProgramm {

  public static void main(String[] args) {
  
    // Erzeuen des ersten Objekts meinOpel
    Pkw meinOpel = new Pkw("Opel","Astra",75,5500);
    
    // Zuweisen von Werten an die Instanz-Variablen
    meinOpel.baujahr = 2009;
    meinOpel.farbe = "blau";
    meinOpel.motorBauart = "6-Zylinder/Dieselmotor";
    meinOpel.getriebevariante = "5-Gang-Schaltgetriebe";
    meinOpel.anhaengerkupplung = false;
    
    // Aufruf der Instanz-Methode infoPkw()
    meinOpel.infoPkw();

    // Erzeuen des zweiten Objekts mein BMW
    Pkw meinGolf = new Pkw();
    
    // Zuweisen von Werten an die Instanz-Variablen
    meinGolf.hersteller = "VW";
    meinGolf.modell = "Golf";
    meinGolf.baujahr = 2012;
    meinGolf.farbe = "silber";
    meinGolf.motorBauart = "4-Zylinder/Ottomotor";
    meinGolf.leistung = 110;
    meinGolf.getriebevariante = "Automatikgetriebe";
    meinGolf.preis = 25000;
    meinGolf.anhaengerkupplung = true;
    
    // Aufruf der Instanz-Methode infoPkw()
    meinGolf.infoPkw();
    
    // neue Lackierung
    meinOpel.farbe = "rot";
    System.out.println("\n\nneue Farbe Opel: " + meinOpel.farbe);

    System.out.println("\nAB6 -----------------------------------");
    // meinGolf tunen
    meinGolf.tunen(50);
    meinGolf.infoPkw();
    
    // Leistung von meinGolf in PS anzeigen
    System.out.println("\nLeistung in PS: " + meinGolf.umrechnenLeistung());
    
    // Benzinverbrauch berechnen und in der Konsole anzeigen
    double meinVerbrauch;
    meinVerbrauch = meinGolf.berechnenVerbrauch(500, 47.5);
    System.out.println("\nBenzinverbrauch: " + meinVerbrauch);
  }

}
