package forum

class User {
    static hasMany = [topics:Topic,posts:Post]

    static constraints = {
    }
}
