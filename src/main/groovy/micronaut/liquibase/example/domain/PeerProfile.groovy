package micronaut.liquibase.example.domain

import grails.gorm.annotation.Entity
import io.micronaut.core.annotation.Introspected
import org.grails.datastore.gorm.GormEntity

@Introspected
@Entity
class PeerProfile implements GormEntity<PeerProfile> {
    String firstName
    String lastName
}
