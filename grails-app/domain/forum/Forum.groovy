package forum

class Forum {
    static hasMany = [topics:Topic]
    static mapping = {
        topics joinTable: false,column: 'Forum_id'
    }

    static constraints = {
    }
}
