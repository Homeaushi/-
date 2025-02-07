package org.example;

public class ComplexA {
    final double m_re;
    final double m_im;

    public ComplexA(double re, double im){
        m_re = re; m_im = im;
    }

    public boolean equals(Object other){
        return (other instanceof ComplexA)
                && (((ComplexA) other).m_re == m_re)
                && (((ComplexA) other).m_im == m_im);
    }
}
