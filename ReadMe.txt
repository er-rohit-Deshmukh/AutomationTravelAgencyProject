--------Reference Project Data !!!----

******URL for Booking Controller******

 http://localhost:9999/book/view-booking-status
 http://localhost:9999/book/view-bookstatus-by-id/{bookingID}
 http://localhost:9999/book/book-vehicle
 http://localhost:9999/book/cancel-booking/{bookingId}
 
 *******Url for DriverController*******
 
 http://localhost:9999/dri/view-all-driv
 http://localhost:9999/dri/view-driv-by-id/{driverID}
 http://localhost:9999/dri/add-driv
 http://localhost:9999/dri/delete-driv
 http://localhost:9999/dri/modify-driv
 
 ******URL for RouteController******
 
 http://localhost:9999/Rou/view-all-Rou
 http://localhost:9999/Rou/get-Rou-by-id/{routeID}
 http://localhost:9999/Rou/add-Rou
 http://localhost:9999/Rou/delete-Rou
 http://localhost:9999/Rou/modify-Rou
 
 *****URL for VehicleController********
 
 http://localhost:9999/vehi/view-all-vehi
 http://localhost:9999/vehi/view-vehi-by-id/{vehicleID}
 http://localhost:9999/vehi/add-vehi
 http://localhost:9999/vehi/modify-vehi
 http://localhost:9999/vehi/delete-vehi
 
 
 ******* Json format for vehicle add******

{
 
  "vehicleNo": "mh 20 FH 9984",
  "vehicleName": "veer",
  "vehicleType": "sleeper",
  "vehicleSeatingCapacity": 34,
  "farePerKM":11,
  "route": {
    "routeId": 1
 
  },
  "driver": {
    "driverId": 1
  
  }
}

******Swagger Link********

     http://localhost:9999/swagger-ui/index.html#/

***** DB Query for table******

   select * from driver_table;
   select * from booking_table;
   select * from route_table;
   select * from user_table;
   select * from vehicle_table;
   