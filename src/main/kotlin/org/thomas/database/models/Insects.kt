package org.thomas.database.models

import lombok.Data
import org.hibernate.Hibernate
import java.util.*
import javax.persistence.*

@Data
@Entity
@Table(name = "insects")
data class Insects (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,
    val name: String,
    val description: String,
    val image: String?,
    val type: String?,
    val rarity: Int,
    @Column(name = "discover_at")
    val discoverAt: Date?
    ) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Insects

        if (id != other.id) return false
        if (name != other.name) return false
        if (description != other.description) return false
        if (image != other.image) return false
        if (type != other.type) return false
        if (rarity != other.rarity) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id
        result = 31 * result + name.hashCode()
        result = 31 * result + description.hashCode()
        result = 31 * result + (image?.hashCode() ?: 0)
        result = 31 * result + (type?.hashCode() ?: 0)
        result = 31 * result + rarity
        return result
    }

    override fun toString(): String {
        return "Insects(id=$id, name='$name', description='$description', image=$image, type=$type, rarity=$rarity)"
    }
}