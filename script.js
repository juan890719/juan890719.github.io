		const para = document.querySelector('.hey');
		function updateName() {
			let name = prompt('輸入新的名字');
			para.textContent = 'Hello~ ' + name;
		}
		const buttons = document.querySelector('.name');
		buttons.addEventListener('click',updateName);
		
		$('h1').click(function() {
			$(this).css('color', 'pink');
		});
		
		$('.h').show(5000);