package _01.aop.notes;

public class Notes {

}


//AOP -> Aspect Oriented Programming

//cross-cutting  concern(iþ)

//http://www.injavawetrust.com/wp-content/uploads/cross-cutting.png 

//loglama , security , transaction management gibi isler gercek projelerde
//business logic disinda ihtiyac duyulan temel islerdendir.

//projemizde/service te ne yaparsak yapalim bu tarz islere ihtiyac duyariz.
//bu gibi islere cross cutting corcern isler adi verilir.

//not: trnsaction management 2 yaklaþýmý vardýr : declerative ve programmatic

//https://en.wikipedia.org/wiki/Aspect-oriented_programming 

//http://docs.spring.io/spring/docs/current/spring-framework-reference/html/aop.html
/*
 * Aspect-Oriented Programming (AOP) complements Object-Oriented Programming
 * (OOP) by providing another way of thinking about program structure. The key
 * unit of modularity in OOP is the class, whereas in AOP the unit of modularity
 * is the aspect.
 */

//AOP teknigi OOP tekniginin yerine gelmis bir yaklasim degildir.
//AOP teknigi OOP teknigiinin tamamlayicisidir.
//OOP yaklasiminda modulerligi class'larla saglariz. AOP yaklasiminda modulerligi Aspect'lerle saglariz.


//AOP teknigi ile , business logic'te yer alan cross cutting corcern/isleri business logicten cikartip modulerligi saglariz.
//AOP teknigi separation of concern'e(modülerlik - iþlerin ayrýþtýrýlmasý) katki saglayacaktir.
//Boylece kodumuz daha temiz/clean ve moduler olacaktir.