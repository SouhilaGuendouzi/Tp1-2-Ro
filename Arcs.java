package com.company;

public class Arcs  implements Comparable<Arcs>{
    public Sommet s1,s2;
    public String Nom; //pour la matrice dincidence
    public int poid;
    public Arcs (Sommet s1,Sommet s2){
        this.s1=s1;
        this.s2=s2;
    }
    public Arcs(String Nom,Sommet s1,Sommet s2)
    {
        this.Nom=Nom;
        this.s1=s1;
        this.s2=s2;
    }

    public Arcs(int poid,Sommet s1,Sommet s2)
    {
        this.poid=poid;
        this.s1=s1;
        this.s2=s2;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Arcs )) return false;
        else return ((this.s1.equals((((Arcs) obj).s1)) )&&(this.s2.equals((((Arcs) obj).s2)) ));
    }

    @Override
    public int compareTo(Arcs o) {
        if (this.poid>o.poid) return 1;
        else if (this.poid<o.poid) return -1;
        else return 0;
    }
}
