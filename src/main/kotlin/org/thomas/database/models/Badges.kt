package org.thomas.database.models

import lombok.Data
import org.hibernate.Hibernate
import java.util.*
import javax.persistence.*


@Data
@Entity
@Table(name = "badges")
data class Badges (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,
    val title: String,
    val description: String,
    val image: String,
    val points: Int,
    @Column(name = "created_at")
    val createdAt: Date,
    @Column(name = "updated_at")
    val updatedAt: Date,
    val metric: String,
    @Column(name = "required_value")
    val requiredVal: Int
    ) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Badges

        if (id != other.id) return false
        if (title != other.title) return false
        if (description != other.description) return false
        if (image != other.image) return false
        if (points != other.points) return false
        if (createdAt != other.createdAt) return false
        if (updatedAt != other.updatedAt) return false
        if (metric != other.metric) return false
        if (requiredVal != other.requiredVal) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id
        result = 31 * result + title.hashCode()
        result = 31 * result + description.hashCode()
        result = 31 * result + image.hashCode()
        result = 31 * result + points
        result = 31 * result + createdAt.hashCode()
        result = 31 * result + updatedAt.hashCode()
        result = 31 * result + metric.hashCode()
        result = 31 * result + requiredVal
        return result
    }

    override fun toString(): String {
        return "Badges(id=$id, title='$title', description='$description', image='$image', points=$points, createdAt=$createdAt, updatedAt=$updatedAt, metric='$metric', requiredVal=$requiredVal)"
    }
}