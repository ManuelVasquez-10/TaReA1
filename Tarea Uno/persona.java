
public class persona
{
    String nombre ;
    int edad ;
    String nacionalidad ;
    String fechanacimiento ;
    String colorojos ;
    String colorpelo;

    public persona(String nombre,int edad , String nacionalidad ,String fechanacimiento,String colorojos,String colorpelo)
    {     
        this.nombre=nombre;
        this.edad=edad;
        this.nacionalidad=nacionalidad;
        this.fechanacimiento=fechanacimiento;
        this.colorojos=colorojos;
        this.colorpelo=colorpelo;
    }
    
      public persona(String nacionalidad, String fechanacimiento)     
    {
        this.nombre=nombre;
        this.edad=edad;
        this.nacionalidad="boliviana";
        this.fechanacimiento="12/05/2003";
        this.colorojos=colorojos;
      
    }
    
         public persona(String nacionalidad, String nombre,int edad , String fechanacimiento)     
    {
        this.nombre="Manuel";
        this.edad="17";
        this.nacionalidad="boliviana";
        this.fechanacimiento="12/05/2003";
        this.colorojos=colorojos;
    }
    
             public persona(String nacionalidad, String nombre,int edad , String fechanacimiento,String colorojos)     
    {
        this.nombre="Manuel";
        this.edad="17";
        this.nacionalidad="boliviana";
        this.fechanacimiento="12/05/2003";
        this.colorojos="cafe";// initialise instance variables
      
    }
    
              public persona(String nacionalidad, String nombre,int edad , String fechanacimiento,String colorojos)     
    {
        this.nombre="Manuel";
        this.edad="17";
        this.nacionalidad="boliviana";
        this.fechanacimiento="12/05/2003";
        this.colorojos="cafe";
        this.colorpelo="negro";
      }   
      
                    public persona(String nacionalidad, String nombre,int edad , String fechanacimiento,String colorojos)     
    {
        this.nombre="Manuel";
        this.edad="17";
        this.nacionalidad="boliviana";
        this.fechanacimiento="12/05/2003";
        this.colorojos="cafe";
        this.colorpelo="negro";
      } 

                public String saludar()     
    {
        string saludo;
        saludo= "Hola mi nombre es" + nombre + "y tengo" + edad + "soy de nacionalida" + nacionalidad + "naci el" +
        fechanacimiento + "mis ojos son color" + colorojos + "y mi cabello es de color" + colorpelo;
      }   
      
                public String despedirse()     
    {
        string despedirse;
        saludo= "Bueno llego el momento de despedirse"+ "un placer en conocerlo"+"y saber que los dos somos de la misma nacionalidad"
        + nacionadad;   
      }   
       public String getNombre()     
    {
         return nombre;  
      }   
      
         public void setNombre(string nombre)     
    {
         this.nombre=nombre;  
      }   
      public String getEdad()     
    {
         return edad;  
      }   
      
         public void setEdad(int edad)     
    {
         this.edad=edad;  
      }   
      public String getNacionalidad()     
    {
         return nacionalidad;  
      }   
      
         public void setNacionalidad(string nacionalidad)     
    {
         this.nacionalidad=nacionalidad;  
      }   
      public String getFechanacimiento()     
    {
         return Fechanacimiento;  
      }   
      
         public void setFechanacimiento(string fechanacimiento)     
    {
         this.fechanacimiento=fechanacimiento;  
      }   
      public String getColorojos()     
    {
         return colorojos;  
      }   
      
         public void setColorojos(string colorojos)     
    {
         this.colorojos=colorojos;  
      }   
      public String getColorpelo()     
    {
         return colorpelo;  
      }   
      
             public void setColorpelo(string colorpelo)     
    {
         this.colorpelo=colorpelo;  
      }   