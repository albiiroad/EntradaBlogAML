package EntradaBlogAML1;


/**
 * 06/02/23
 * @author Alba
 * versión 3.3
 */
public class EntradaBlogAML {
		
		/**
		 * definir atributos
		 */
		public static char separador=':';
		private int id;
		private String texto;
		private String autor;
		
		/**
		 * 
		 * @param id int
		 * @param autor String
		 * @param texto String
		 * @throws IllegalArgumentException new exception
		 */
		public EntradaBlogAML(int id,String autor,String texto)throws IllegalArgumentException{
			if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
			this.id=id;
			this.autor=autor;
			this.texto=texto;
		}
		/**
		 * @return cad
		 */
		@Override
		public String toString(){
			String cad="";
			cad+="\nENTRADA DE"+separador+autor;
			cad+="\n "+texto;
			return cad;
		}
		/**
		 * @return this.id
		 */
		public int getId(){
			return this.id;
		}
		/**
		 * @return this.texto
		 */
		public String getTexto(){
			return this.texto;
		}
		/**
		 * @return this.autor.toUpperCase()
		 */
		public String getAutor(){
			return this.autor.toUpperCase();
		}
		
		/**
		 * 
		 * @param args main
		 */
		public static void main(String[] args) {
	                
			EntradaBlogAML e1 = new EntradaBlogAML (3,"ana","Últimas noticias, está disponible BixBy 2.0");
			System.out.println(e1);
		}
	}


