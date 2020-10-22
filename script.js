		const para = document.querySelector('.hey');
		function updateName() {
			let name = prompt('輸入新的名字');
			para.textContent = 'Hello~ ' + name;
		}
		const buttons = document.querySelector('.name');
		buttons.addEventListener('click',updateName);