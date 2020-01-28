package book

class Book {
    static  belongsTo = Author
    static hasMany = [author: Author]

    //many-to-many relationships by defining a hasMany on both sides of the relationship and
    // having a belongsTo on the owned side of the relationship

    static constraints = {
    }
}
