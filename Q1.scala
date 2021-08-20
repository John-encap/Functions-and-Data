object Q1 extends App {
    val r1 = new Rational(1,2)
    val r2 = new Rational(4,5)
    println(r1.neg)
    val r = r1.add(r2)
    println(r)
}

class Rational(n:Int, d:Int) {
    require(denom > 0, "Denominator must be greater than 0")
    def numer = n
    def denom = d

    def add(r:Rational) = new Rational(this.numer*r.denom + this.denom*r.numer, this.denom*r.denom)
    def neg = new Rational(-this.numer, this.denom)
    override def toString(): String = numer + "/" + denom
}
