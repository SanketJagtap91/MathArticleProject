package com.nse.volume;

public class Volume {

	
	public double volumeOfSphere(double r) 
		{
			double VOS = (4/3)*3.14*r*r;
			return VOS;
		}
	public double volumeOfCylinder(double r, double h)
		{
			double VOC = 3.14*r*r*h;
			return VOC;
		}
	public double volumeOfCuboid(double l, double w, double h)
		{
			double VOCub = l*w*h;
			return VOCub;
		}
	public double volumeOfCone(double r, double h)
		{
			double VOCo= 0.334*3.14*r*r*h;
			return VOCo;
		}
}
