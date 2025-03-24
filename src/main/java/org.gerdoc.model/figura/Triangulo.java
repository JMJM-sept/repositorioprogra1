package org.gerdoc.model.figura;

import org.gerdoc.util.ReadUtil;
import org.gerdoc.vista.Menu;

import java.io.*;
import java.util.*;

/**
 * 
 */
public abstract class Triangulo extends Figura
{
    protected double base;
    protected double altura;

    /**
     * Default constructor
     */
    public Triangulo()
    {
    }

    public Triangulo(double base, double altura)
    {
        this.base = base;
        this.altura = altura;
    }

    public double area()
    {
        return (base*altura)/2;
    }

    /**
     * @return
     */
    public abstract double perimetro();

    public double getBase()
    {
        return base;
    }

    public void setBase(double base)
    {
        this.base = base;
    }

    public double getAltura()
    {
        return altura;
    }

    public void setAltura(double altura)
    {
        this.altura = altura;
    }

    @Override
    public void leeDatos( )
    {
        Menu.leeBase( );
        base = ReadUtil.readInt( );
        Menu.leeAltura( );
        altura = ReadUtil.readInt( );
    }
}