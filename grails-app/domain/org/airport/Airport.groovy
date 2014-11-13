package org.airport

class Airport {
	
	/* case .1 
	static hasMany = [flights: Flight] // one to many
	static mappedBy = [flights: "departureAirport"] // mapping target
    */
	
	// case .2 -- multiple collections 
	static hasMany = [outboundFlights: Flight, inboundFlights: Flight]
	static mappedBy = [outboundFlights: "departureAirport", inboundFlights: "destinationAirport"]
	
    static constraints = {
    }
}
