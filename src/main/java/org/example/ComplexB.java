package org.example;

public class ComplexB {
    private final double m_re;
    private final double m_im;

    public ComplexB(double re, double im){
        m_re = re; m_im = im;
    }

    public boolean equals(Object other){
        return (other instanceof ComplexA)
                && (((ComplexA) other).m_re == m_re)
                && (((ComplexA) other).m_im == m_im);
    }
}
