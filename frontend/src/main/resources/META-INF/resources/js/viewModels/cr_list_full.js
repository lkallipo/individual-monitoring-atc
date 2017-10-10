define(['ojs/ojcore', 'knockout', 'setting_properties', 'jquery', 'ojs/ojknockout', 'ojs/ojtable', 'ojs/ojgauge', 'ojs/ojarraytabledatasource', 'urls'],
        function (oj, ko, sp, $)
        {
<<<<<<< HEAD
			var m=0;
			
			sessionStorage.setItem('clck',0);
			
=======
>>>>>>> c4a-atc/master

            function ListViewModel() {
                var self = this;
                self.data = ko.observableArray();
<<<<<<< HEAD
                self.usersOuter = ko.observableArray();
                
                var pilotCode = sessionStorage.getItem("pilotcode");
                               
                $.getJSON(CARE_RECIPIENT_ALL + "/pilotCode/" + pilotCode).
                
                       then(function (users) {
                    	   
                    	   //printing all cr from json:
                    	   //console.log( JSON.stringify(users) );
                    	   
                    	   
                            $.each(users.itemList, function () {

                                var frailStatus;
                                if (this.frailtyStatus === undefined || this.frailtyStatus === null) {
=======
                
                var jwt = sessionStorage.getItem("jwt");

                $.ajaxSetup({
                  cache: false,
                  headers : {
                    'Authorization' : jwt}
                });
                $.getJSON(CARE_RECIPIENT_ALL + "?t=" + Date.now()).
                        then(function (users) {
                            $.each(users.itemList, function () {

                                var frailStatus;
                                if (this.frailtyStatus === null) {
>>>>>>> c4a-atc/master
                                    frailStatus = "pre-frail-fit";
                                } else {
                                    frailStatus = this.frailtyStatus;
                                }
<<<<<<< HEAD
                                
                                var frailNotice;
                                if (this.frailtyNotice === undefined || this.frailtyNotice === null) {
                                	frailNotice = "";
                                } else {
                                	frailNotice = this.frailtyNotice;
                                }
=======
>>>>>>> c4a-atc/master

                                self.data.push({
                                    cr_id: this.userId,
                                    fr_status: frailStatus,
<<<<<<< HEAD
                                    fr_notice: frailNotice,
=======
                                    fr_notice: this.frailtyNotice,
>>>>>>> c4a-atc/master
                                    textline: this.textline,
                                    attention: this.attention,
                                    det_status: this.detectionStatus,
                                    det_date: this.detectionDate,
                                    interv_status: this.interventionstatus,
                                    interv_date: this.interventionDate,
                                    age: this.age,
                                    pilotcode: this.pilotCode
                                });
                                $(".loader-hover").hide();
                            });
<<<<<<< HEAD
                            ;
                            self.usersOuter = users;
                            
=======
>>>>>>> c4a-atc/master
                        });



                self.dataSource = new oj.ArrayTableDataSource(

                        self.data, {
                            idAttribute: "cr_id"
                        });

                self.menuItemSelect = function (event, ui) {
                    var currentRow = $('#table').ojTable('option', 'currentRow');
<<<<<<< HEAD
                    var selectData;
                    
                  //finding cr with cr_id = selectedRow.keyId
		              for(var i = 0; i< self.data().length; i++){                    	                   	
			                         if(self.data()[i].cr_id == currentRow.rowKey){                   		
			                              		selectData = self.data()[i];
			                                      	}
			               }

                    console.log(" selected care recipient with: id " + selectData['cr_id'] + " age " + selectData['age']);
=======
                    var selectData = self.data()[currentRow['rowIndex']];
                    console.log("id " + selectData['cr_id'] + " age " + selectData['age']);
>>>>>>> c4a-atc/master

                    switch (ui.item.attr("id")) {
                        case "view_more_det":
                            oj.Router.rootInstance.store(selectData['cr_id']);
                            oj.Router.sync();

                            sp.setuserTextline(selectData['textline']);

<<<<<<< HEAD
                            
                            //app should be defined in define block for this below to work!
                            
                           /* app.age(selectData['age']);

                            app.textline(selectData['textline']);*/
=======
                            app.age(selectData['age']);
                            app.textline(selectData['textline']);
>>>>>>> c4a-atc/master

                            oj.Router.rootInstance.go("detection_gef");

                            break;
                        case "view_inter_sum":
                            console.log("clicked");
                            break;
                        default:
                    }
                };

                self.navigateToGef = function() {
                    var currentTableRow = $( "#table" ).ojTable("option", "currentRow");
<<<<<<< HEAD
                    var crData;
	                  //finding cr with cr_id = selectedRow.keyId
	                  for(var i = 0; i< self.data().length; i++){                    	                    	
	                        if(self.data()[i].cr_id == currentTableRow.rowKey){                   		
	                                      		crData = self.data()[i];
	                                      	}
	                                      }
	
	                    self.viewGef(crData.cr_id,crData.textline,crData.age);
=======
                    var crData = self.data()[currentTableRow.rowIndex];
                    self.viewGef(crData.cr_id,crData.textline,crData.age);
>>>>>>> c4a-atc/master
                };

                self.viewGef = function (userId, textline, age) {
                    oj.Router.rootInstance.store(userId);
                    sp.setUserId(userId);
                    sp.setuserTextline(textline);
                    sp.setuserAge(age);
                    console.log("userId " + userId + " Age " + age + " textline " + textline);

                    oj.Router.rootInstance.go("detection_gef");
                };

                self.viewGes = function () {
                	oj.Router.rootInstance.go("cr_list_full");
                };


                self.changeButtonIcon = function (isPaused, data, event) {
                    console.log("event ", event.type);
                };
                
            }

            return new ListViewModel();

        });