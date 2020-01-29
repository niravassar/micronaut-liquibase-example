package micronaut.liquibase.example.controller

import grails.gorm.transactions.Transactional
import groovy.transform.CompileStatic
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import micronaut.liquibase.example.domain.PeerProfile

@CompileStatic
@Controller("/peerProfile")
@Transactional
class PeerProfileController {

    @Get("/")
    HttpResponse<List<PeerProfile>> list() {
        final List<PeerProfile> peerProfileNewList = PeerProfile.list()

        HttpResponse.ok(peerProfileNewList)
    }
}

