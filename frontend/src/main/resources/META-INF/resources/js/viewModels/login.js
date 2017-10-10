define(['ojs/ojcore', 'knockout', 'setting_properties', 'appController', 'jquery',
    'ojs/ojknockout', 'ojs/ojinputtext', 'ojs/ojbutton', 'urls'],
        function (oj, ko, sp, app, $) {

            function LoginViewModel() {
                $(".loader-hover").hide();
                var self = this;

                // this.userLabel = oj.Translations.getTranslatedString('user_l');
                // this.passwordLabel=  oj.Translations.getTranslatedString('password_l');
                // this.loginLabel = oj.Translations.getTranslatedString('login_l');
                // this.resetLabel = oj.Translations.getTranslatedString('reset_l');

                var url = sp.baseUrl + sp.loginMethod;

                self.passwordValue = ko.observable();
                self.loginValue = ko.observable();

                // Create handler
                self.loginUser = function (viewModel, event) {
                    console.log("username " + self.loginValue() + " password " + self.passwordValue());

                    $.getJSON(USER_LOGIN + "/username/" + self.loginValue() + "/password/" + self.passwordValue()).
                            then(function (users) {
                                if (users.responseCode === 200) {
                                    /*logged in 
                                     * keep in session storage username and display name
                                     */
                                    sp.setStorageData(users.jwToken, users.displayName, users.pilotName);

                                    $('#appHeader').css({display: 'block'});
                                    $('.user-menu').css({display: 'block'});

                                    oj.Router.rootInstance.go("cr_list_full");
                                    app.userLogin(users.displayName);
                                    app.userPilotName(users.pilotName);

                                } else if (users.responseCode === 401) {
                                    console.log("wrong credentials ", users.message);
                                }
                            });
                };

                self.resetForm = function (viewModel, event) {
                    self.loginValue('');
                    self.passwordValue('');
                };
                $('#mainContent').css({'background-color': '#f1f1f1'});
                $('#mainContent').css({'border-color': '#f1f1f1'});
            }
            var loginViewModel = new LoginViewModel();
            return  loginViewModel;
        });