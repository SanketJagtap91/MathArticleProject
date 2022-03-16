package com.nse.runner;

import com.nse.volume.Volume;

public class VolumeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Volume V1 = new Volume();
		
		
		double VOS=V1.volumeOfSphere(15.5);
		double VOC=V1.volumeOfCylinder(10, 15);
		double VOCub=V1.volumeOfCuboid(20, 20.5, 65.2);
		double VOCo=V1.volumeOfCone(4,20);
		
		
		
		System.out.println("Volume Of Sphere :"+ VOS);
		System.out.println("Volume Of Cylinder :"+ VOC);
		System.out.println("Volume Of Cuboid :"+ VOCub);
		System.out.println("Volume Of Cone :"+ VOCo);

		
	}

}
