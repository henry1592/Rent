class nodoV
{
	int placa,CedCliente;
	String color,marca,Combustible;
	nodoV sig;

//**********************************************************************************

	public nodoV(int placa,String color,String marca,int CedCliente,String Combustible)
	{
		this.placa=placa;
		this.color=color;
		this.marca=marca;
		this.CedCliente=CedCliente;
		this.Combustible = Combustible;
		sig=null;
	}
		public void imprimir()
	{
		System.out.println("");
		System.out.println("-----------------------------------");
		System.out.println("");
		System.out.println(" ** Cedula Cliente :"+CedCliente);
		System.out.println(" ** Placa : "+placa);
		System.out.println(" ** Color : "+color);
		System.out.println(" ** Marca : "+marca);
		System.out.println(" ** Tipo De Combustible: "+Combustible);
		System.out.println("-----------------------------------");
		System.out.println("");
	}

//**********************************************************************************
   public void insertarFinal(int placa,String color, String marca,int CedCliente,String Combustible)//cola
   	{

   		if (sig==null)
   		{
   		nodoV minodo= new nodoV(placa,color,marca,CedCliente,Combustible);
   		sig=minodo;
   	    }
   		else
   	    {
   	     sig.insertarFinal(placa,color,marca,CedCliente,Combustible);// recursividad, se invoca sobre si mismo
   	    }
   }

	public void insertar (nodoV minodo)
	{
		if (sig == null)
		{
		  sig = minodo;
	  	}
		else
		sig.insertar(minodo);
	  }

//**********************************************************************************

	public void mostrar()
	{

		if (sig==null)
		{
			imprimir();
		}
		else
		{
			imprimir();
			sig.mostrar();
		}
	}

//**********************************************************************************

	public void mostrarInversa()
	{
	 	if (sig==null)
	 	{
			imprimir();
		}
		else
		{
			sig.mostrar();
			imprimir();
		}
	}
}