package org.gerdoc.model.figura;

import org.gerdoc.vista.SolicitaDatos;

import java.io.*;
import java.util.*;

/**
 * 
 */
public abstract class Figura implements SolicitaDatos
{

    /**
     * Default constructor
     */


    public Figura()
    {
    }

    /**
     * @return
     */
    public abstract double area( );

    /**
     * @return
     */
    public abstract double perimetro();
}