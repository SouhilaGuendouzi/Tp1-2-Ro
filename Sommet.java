package com.company;

import java.util.ArrayList;

public class Sommet implements Comparable<Sommet>{
    String title;
    String Couleur ;
    int degree;
    int Cout;
    public Sommet(){
        this.degree=1;
    }
    public Sommet (String title )
    {
        this.title=title;
        this.degree=1;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Sommet) )return false ;
        else return this.title.equals(((Sommet) obj).title);
    }

    @Override
    public String toString() {
        return "Sommet{" +
                "title='" + title + '\'' +
                '}';
    }

    @Override
    public int compareTo(Sommet o) {
        if (this.degree<o.degree) return 1;
        else if (this.degree>o.degree) return -1;
        else return 0;

    }
    public boolean equals_Nouveau(Sommet s)
    {
        if(s.title.equals(this.title)) return true;
        else return false;
    }
}
