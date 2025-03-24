package org.gerdoc.model.figura;

import org.gerdoc.util.ReadUtil;
import org.gerdoc.vista.Menu;

import java.io.*;
import java.util.*;

/**
 * 
 */
public class Equilatero extends Triangulo
{

    protected double lado1;

    public Equilatero()
    {
    }

    public Equilatero(double base, double altura, double lado1)
    {
        super(base, altura);
        this.lado1 = lado1;
    }

    public double getLado1() {

        return lado1;
    }

    /**
     * @param lado1
     */
    public void setLado(double lado1)
    {
        this.lado1 = lado1;
    }

    /**
     * @return
     */
    public  double perimetro()
    {
        return lado1*3;
    }

    @Override
    public void leeDatos()
    {
        super.leeDatos();
        Menu.leeLado1( );
        lado1 = ReadUtil.readInt( );
    }
}