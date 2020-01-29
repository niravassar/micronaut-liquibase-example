package micronaut.liquibase.example

import grails.gorm.transactions.Transactional
import io.micronaut.context.event.StartupEvent
import io.micronaut.runtime.event.annotation.EventListener
import micronaut.liquibase.example.domain.PeerProfile

import javax.inject.Singleton

@Singleton
@Transactional
class Bootstrap {

    @EventListener
    void onStartup(StartupEvent startupEvent) {
        if (PeerProfile.count() == 0) {
            PeerProfile nirav = new PeerProfile(firstName: 'Nirav', lastName: 'Assar')
            nirav.save()
        }

    }
}
