import java.util.Calendar;

public class mainclass {
	public static void main(String[] args)
	{
		University u1 = new University("Universitatea Fictionala", "Bucuresti");
		Author a1 = new Author("George Popescu");
		Journal j1 = new Journal("Jurnalul unui programator politehnist",Calendar.getInstance(),2,"Jurnalul bla bla",9001);
		Journal j2 = new Journal("Jurnalul unui programator politehnist II",Calendar.getInstance(),2,"Jurnalull bla bla",9001);
		Publication p1 = new ConferenceProceeding("Conferinta programatorului politehnist",Calendar.getInstance(),1,"Volumul 1",true);
		Publication p2 = new ConferenceProceeding("Conferinta programatorului politehnist",Calendar.getInstance(),1,"Volumul 2",false);
		a1.addPublication(j1);
		a1.addPublication(j2);
		a1.addPublication(p1);
		a1.addPublication(p2);
		u1.addAuthor(a1);
		Author a2 = new Author("Pope Georgescu");
		Journal j3 = new Journal("Jurnalul unui programator fara facultate",Calendar.getInstance(),2,"Jurnalul bla bla",1001);
		Journal j4 = new Journal("Jurnalul unui programator fara facultate II",Calendar.getInstance(),2,"Jurnalull bla bla",1001);
		Publication p3 = new ConferenceProceeding("Conferinta programatorului fara facultate",Calendar.getInstance(),1,"Volumul 1",true);
		Publication p4 = new ConferenceProceeding("Conferinta programatorului fara facultate",Calendar.getInstance(),1,"Volumul 2",false);
		a2.addPublication(j3);
		a2.addPublication(j4);
		a2.addPublication(p3);
		a2.addPublication(p4);
		u1.addAuthor(a2);
		System.out.println(u1.computeScore());
		
	}
}
