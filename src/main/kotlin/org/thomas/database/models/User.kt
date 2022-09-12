package org.thomas.database.models

import lombok.Data
import org.hibernate.Hibernate
import java.util.*
import javax.persistence.*

@Data
@Entity
@Table(name = "users")
data class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,
    val email: String,
    val username: String,
    val password: String?,
    @Column(name = "birth_date")
    val birthDate: Date?,
    @Column(name = "created_at")
    val createdAt: Date,
    @Column(name = "updated_at")
    val updatedAt: Date,
    @Column(name = "google_id")
    val googleId: String?,
    val points: Int
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || Hibernate.getClass(this) != Hibernate.getClass(other)) return false
        other as User

        return id == other.id
    }

    override fun hashCode(): Int = javaClass.hashCode()

    @Override
    override fun toString(): String {
        return this::class.simpleName + "(id = $id , email = $email , username = $username , password = $password , birthDate = $birthDate , createdAt = $createdAt , updatedAt = $updatedAt , googleId = $googleId , points = $points )"
    }
}