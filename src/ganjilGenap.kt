import java.util.*

fun main (args : Array<String>){
        angkaSiswa()
}
fun angkaSiswa () {
    var scan = Scanner(System.`in`)
    println("masukkan nama")
    var nama = scan.next()
    println("masukkan nim")
    var nim = scan.nextInt()
    var dijitnim = nim%10
    println("Angka terakhi nim adalah $dijitnim")
    for(i in 1..100){
        if(i%2==0){
            print(","+i)
        }
    }
    println("")
    do {
        println("apakah anda ingin menginputkan ulang (Tidak/Ya)")
        var pilih = scan.next()
        if (pilih == "Tidak") {
            println("Terimakasih")
        } else {
            println("masukkan nama")
            var nama = scan.next()
            println("masukkan nim")
            var nim = scan.nextInt()
            var dijitnim = nim % 10
            println("Angka terakhi nim adalah $dijitnim")
            for (i in 1..100) {
                if (i % 2 == 0) {
                    print(","+i)
                }
            }
            println()
        }
    }while(pilih!="Tidak")
}
