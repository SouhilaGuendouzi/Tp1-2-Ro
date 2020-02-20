package com.company;

import java.util.ArrayList;

public class Graphe {
    String Type;
    int Nbr_Sommet;
    int Nbr_Arc;
ArrayList<Sommet> sm=new ArrayList<Sommet>();
ArrayList<Arcs>  arc=new ArrayList<Arcs>();
public Graphe(){}
public Graphe(String Type)
{
    this.Type=Type;
}
public Graphe(ArrayList<Sommet> s,ArrayList<Arcs> a)
{
    this.Nbr_Sommet=s.size();
    this.Nbr_Arc=a.size();
    this.sm=s;
    this.arc=a;
}


}
