PrimeFaces.locales['fr'] = {
	closeText : 'Fermer',
	prevText : 'Pr�c�dent',
	nextText : 'Suivant',
	monthNames : [ 'Janvier', 'F�vrier', 'Mars', 'Avril', 'Mai', 'Juin',
			'Juillet', 'Ao�t', 'Septembre', 'Octobre', 'Novembre', 'D�cembre' ],
	monthNamesShort : [ 'Jan', 'F�v', 'Mar', 'Avr', 'Mai', 'Jun', 'Jul', 'Ao�',
			'Sep', 'Oct', 'Nov', 'D�c' ],
	dayNames : [ 'Dimanche', 'Lundi', 'Mardi', 'Mercredi', 'Jeudi', 'Vendredi',
			'Samedi' ],
	dayNamesShort : [ 'Dim', 'Lun', 'Mar', 'Mer', 'Jeu', 'Ven', 'Sam' ],
	dayNamesMin : [ 'D', 'L', 'M', 'M', 'J', 'V', 'S' ],
	weekHeader : 'Semaine',
	firstDay : 1,
	isRTL : false,
	showMonthAfterYear : false,
	yearSuffix : '',
	timeOnlyTitle : 'Choisir l\'heure',
	timeText : 'Heure',
	hourText : 'Heures',
	minuteText : 'Minutes',
	secondText : 'Secondes',
	currentText : 'Maintenant',
	ampm : false,
	month : 'Mois',
	week : 'Semaine',
	day : 'Jour',
	allDayText : 'Toute la journ�e'
};

/**
 * 
 * @param id
 *            toggle element width id = id
 */
function toggle_visibility(id) {
	var e = document.getElementById(id);
	$(e).stop().animate({
		height : 'toggle',
	}, 500);

}/**
	 * 
	 * @param id
	 *            show element width id=id
	 */
function show(id) {
	var e = document.getElementById(id);
	$(e).stop().animate({
		width : 'show',
	}, 500);

	$(e).delay(5000).animate({
		width : 'hide',
	}, 500);

};

/**
 * 
 * @param id
 *            hide element with id = id
 */
function hide(id) {
	var e = document.getElementById(id);
	$(e).stop().animate({
		width : 'hide',
	}, 500);
};

/**
 * Ref main menu animation
 */
$(document).ready(function() {
	$('.hoverable').click(function() {

		if ($(this).find('.ui-custom-hover').hasClass('toggled')) {
			$('.toggled').stop().animate({
				height : 'toggle',

			}, 200);
			/*
			 * $('.hoverable').find('.squared').stop().delay(100).animate({
			 * borderRadius : '25%', width : '100px' }, 400);
			 */
			$('.hoverable').find('.HeaderDiv').removeClass('is-squared');

			$('.hoverable').find('.ui-custom-hover').removeClass('toggled');

		}

		else {

			$('.toggled').stop().animate({
				height : 'toggle',

			}, 200);
			/*
			 * $('.hoverable').find('.squared').stop().delay(100).animate({
			 * borderRadius : '25%', width : '100px' }, 400);
			 * 
			 * $('.hoverable').stop().animate({ top : '0%', left : '0%' });
			 * 
			 * $('.hoverable').find('.circle-div').removeClass('squared');
			 */
			$('.hoverable').find('.ui-custom-hover').removeClass('toggled');

			$(this).find('.ui-custom-hover').stop().animate({
				height : 'toggle',

			}, 400);
			$('.hoverable').find('.HeaderDiv').removeClass('is-squared');
			$(this).find('.HeaderDiv').addClass('is-squared');
			$(this).find('.ui-custom-hover').addClass('toggled');

		}

	});
});
