Algoritma ve Programlama II

I) PROBLEM
N ve M değerleri klavyeden girilmek üzere, dairesel bir şekilde dizilmiş N adet
balon olduğu bir durumda, M-1 kadar balon atlanıp, M. pozisyondaki balon
patlatılıyor. İşlem bu şekilde kaldığı yerden tek bir balon kalana kadar devam
ediyor. Son kalan balon patlatılmıyor. Diğer bir deyişle, herhangi bir N ve M
değeri verildiğinde patlatılmayacak balonun pozisyonu bulunmak isteniyor.
Program çalışma sonuçlarına örnekler:
N=4 ve M=2 için birinci pozisyondaki balon patlamadan kalır.
N=5 ve M=3 için dördüncü pozisyondaki balon patlamadan kalır.
II) İSTENEN ÇÖZÜM YAKLAŞIMI
Problemin Dairesel Bağlı Liste veri yapısı kullanarak çözülmesi istenmektedir.
Dairesel Bağlı Listede, son düğümün bağ (link) sahası listenin ilk elemanını
(head) göstermektedir.
Çözüm için Yönlendirme:
Aşağıda anlatılan sınıfları gerçekleştiriniz.
Node Sınıfı:
* Node sınıfında, int tipinde "data" ve bir sonraki düğümü gösterecek bağ sahası
olacaktır. Data sahasını balonun pozisyonunu tutmak için kullanacaksınız.
Örneğin, dairesel liste oluşturulurken ilk balonun data sahası 1, ikinci balonun
data sahası 2, üçüncü balonun data sahası 3, vb ... tutacak şekilde liste
oluşturulabilir.
* Node sınıfı için gerekli "constructor" metodu yazınız. Bir adet constructor
metot yeterlidir.
* Node sınıfını isterseniz ayrı bir dosyada, isterseniz aşağıda açıklanan sınıfın
içinde bir iç (inner) sınıf olarak yazabilirsiniz.
Uygulama Sınıfı:
* static void olarak tanımlanacak ve N ile M değerlerini parametre olarak alacak
balonPozisyonuBul metodu yazılacaktır.
static void balonPozisyonuBul(int m, int n)
* balonPozisyonuBul metodu içeriği aşağıdaki gibi olacaktır:
- İlk olarak N adet balondan oluşacak dairesel bağlı listeyi oluşturunuz.
- Daha sonra bu liste üzerinde, problem metninde anlatıldığı üzere son
kalan balonu bulmak için gerekli algoritmayı gerçekleştiriniz.
- Son kalan balonun pozisyonunu yazdırınız.
* Main metot içinde, kullanıcının klavyeden N ve M değerlerini girmesini
isteyip, bu değerler ile balonPozisyonuBul metodunu çağırınız.
