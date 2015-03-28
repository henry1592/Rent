class nodoC // nodo para manejar la lista por el intervalo de tiempo determinado
{
	int cedula;
	String nombre,telefono;
	nodoC sig;

//**********************************************************************************

	public nodoC(int cedula,String nombre,String telefono)
	{
		this.cedula = cedula;
		this.nombre = nombre;
		this.telefono=telefono;
		sig = null;
	}

//**********************************************************************************
	public void insertarFinal(int cedula,String nombre, String telefono)//cola
	{

		if (sig==null)
		{
			nodoC minodo= new nodoC(cedula,nombre,telefono);
			sig=minodo;
	    }
		else
	    {
	    	 sig.insertarFinal(cedula,nombre,telefono);// recursividad, se invoca sobre si mismo
	    }
   }
//**********************************************************************************
	public void imprimir()
	{
		System.out.println("");
		System.out.println("----------------------------");
		System.out.println("Cedula del cliente: "+ cedula);
		System.out.println("Nombre Completo: "+nombre);
		System.out.println("Telefono: " + telefono);
		System.out.println("---------------------------");
		System.out.println("");
	}
//**********************************************************************************
	public void insertar(nodoC minodo)
	{
		if(sig == null)
			sig = minodo;
		else
			sig.insertar(minodo);
	}
//**********************************************************************************
	public void mostrar()
	{
			if ( sig == null)
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
	public void mostrar2()
	{
		if(sig==null)
		{
	    	imprimir();
  		}
  		else
  		{                                                                      {
		  	sig.mostrar2();
	  		imprimir();
		}
  	}
}
}