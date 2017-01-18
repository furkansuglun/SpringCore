package _01.notes;

public class Notes {

}

//Spring , java uygulamalari gelistirmek icin kullandigimz lightweight bir framework/platformdur.

//ilk ortaya atan rod johson expert one - on -one adlý kitabýnda 


//lightweight = modülerlik = az deðiþiklikle max etki 

//siteden ulasilabilir
//https://spring.io/

//uzerinde calisacagimiz proje ;
//http://projects.spring.io/spring-framework/

//Spring Module'leri (yaklaþýk 20 module var . module 'leri jar gibi dusunebiliriz. bkz : google spring framework runtime image)
//Spring Framework , modullerden olusmaktadir.


//core container  (core ,context , beans , spel) (bunlari jar olarak dusunebiliriz)
//data access (orm , jdbc , transaction)
//web (servlet , web, websocket)
//aop , aspect ,test gibi moduller yer almaktadir.

//IOC(Invertiong of Control) ? Dependency Injection ?  (we can say : DI is a IOC technique)

//IOC  : Dependecy Injection ve Dependency Lookup(obje olusturulmasý ve yönetimi w) olarak 2 ye ayrýlýr.

//IOC teknigi/prensibi,  bagimliliklarin(dependency) olusturulmasini yonetimini developerdan alma/koddan kaldirma yaklasimidir.
//Spring framework bir container gibi davranir ve dependency'leri/objeleri yonetir. Spring container bunyesinde yonetilen objelere "bean" adi verilir.

//JSF icin de benzer bir inject mekanizmasindan bahsetmistik
//@ManagedProperty @managedBean 

//Dependency Injection --> bir IOC teknigidir.
//aklimiza spring'te ioc dedigimizde depedency injection teknigi gelecektir.

//benzer bir yaklasim olarak tomcat/servlet container da servlet'leri yonetiyor/olusturoyur/initialize ediyor.
//DI mekanizmasi java bean ve interface based 

//code to interface yaklasimi/prensibi

//class yerine interface tipinde bir degisken kullaniyoruz(list -> interface ,  arraylist ,linkedlist -> class hatta subclass)
//List<String> myList = new ArrayList<String>();
//myList = new LinkedList<String>();
//
//ArrayList<String> badDefine = new ArrayList<String>();



//spirng avantajý diðer frameworkler ile iletiþim halinde olabilir . jdbc için abstract layer , spring ile hibernate e baðlantý veya diðer jpa
//implemetation lara baðlantý saðlar.  etc.





//DI mekanizmasinin avantajlari;

//yapisik kodlari azaltak/reduce glue code
//DI tekniginin en onemli olayi/ozelligi uygulamamizdaki yapisik kodlarin (tight coupled) azaltilmasidir.

//uygulama konfigurasyonunu basitlestirmek / simplified application configuration
//spring'in genel prensibi , "simlified java development"
//test edilebilirlik.

//kod kalitesini artirir. uygulama design kalitesini artirmaktir,
//spring kullandigimizda ve DI mekanizmasini dogru kullandigimizda uygulamamiz iyi bir design'a (esnek/flexible) sahip olacaktir.


//### spring 4.x java8 e destek saglar , geriye donuk java 6 update 18 e kadar uyumluluk saglar.

//### accessing data
//spring , jdbc , jpa , hibernate , jdo gibi veriye ulasmak icin kullandigimiz teknolojilerle uyumlu sekilde calimaktadir.
//bunlar icin destek saglamakatadir.

//#### transaction yonetimi
//transaction icin spring framwork'u cozumler saglamaktadir.
//programmatic ve declarative transaction yonetimleri icin yaklasimlar mevcuttur.

//### spring expression language (spel)

//### aop support / aspect oriented programming

//## validation

//### MVC support
//Spring Framework'un icerisinde MVC kismi yer almaktadir.

//### web socket support
//https://jcp.org/en/jsr/detail?id=356
//web socketlerde client ve server arasinda kalici bir baglanti kurulur(persistent connection)
//http mantiginda , request gider , request tamamlaninca baglanti kapatilir.
	
//### remoting support
/// java remote method invocation (rmi) ,web servisleri ; jax-rs , jax-ws , caucho hessian, jms

//### mail support
//spring ile java mail api kullanabiliriz.

//### job scheduling support (iþ zamanlamasý)
//quartz  job ,  jdk timer api 

//object/xml transformation
//java object- > xml  , marshalling
//xml -> java object -> unmarsahlling


//alternatifleri ;

//jboss seam framework

//google guice ; di implementation 
//https://github.com/google/guice

//javaee7, DI spect'i yer almaktadir.