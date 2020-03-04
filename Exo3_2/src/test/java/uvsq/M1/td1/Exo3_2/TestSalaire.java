package uvsq.M1.td1.Exo3_2;
import static org.junit.Assert.assertEquals;
import java.lang.Double; 
import org.junit.*;
import org.junit.Test;

import  java.util.ArrayList ;
import  java.util.List ;
public class TestSalaire {
	


		 private List  <Employe> employe;




		@Before()
		public void setUp() {
	employe=new ArrayList();
		}
		
		
		@Test
		public void testCalculSalaire() {
			employe.add(new Vendeur("aissou","rachel",25,2018,1,20));
			
			//double s,b=0.0;
			//s.compareTo(b);
			//assertEquals((Double.compare(v.calculeSlaire(),1590.0))== 0);

		}

	}

