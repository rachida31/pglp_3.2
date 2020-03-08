package uvsq.M1.td1.Exo3_2;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
		
		@After()
		public void quoi()
		{
			
		}
		
		@Test
		public void testCalculSalaire() {
			employe.add(new Vendeur("aissou","rachel",25,2018,1,2020,3,20));
			employe.add(new Manager("aissou","aylan",30,2011,3,2020,3,30,5));
			employe.add(new Vendeur("aissou","nadira",31,2009,7,2020,3,50));
			employe.add(new Manager("aissou","marzak",25,2019,1,2020,3,20,6));
			employe.add(new Vendeur("aissou","silas",60,2001,4,2020,3,100));
			employe.add(new Manager("ouchene","siham",25,2020,1,2020,3,10,0));
			employe.add(new Vendeur("ouchene","malika",40,2006,8,2020,3,200));
			employe.add(new Manager("ouchene","saida",48,2004,1,2020,3,20,8));
			employe.add(new Vendeur("ouchene","noura",57,1995,1,2020,3,300));
			employe.add(new Manager("ouchene","hakima",35,2012,2,2020,3,150,13));


		assertTrue(employe.get(0).calculeSlaire()==1560);
		assertTrue(employe.get(1).calculeSlaire()==2210);

		}

	}

