
function isValid() {

  	const price = document.getElementById('price');

	if (!price.value.trim()) {
		alert('입력해 주세요.');
		price.value = '';
		price.focus();
		return false;
	}

	return true;
}

/**
 * 게시글 등록(생성/수정)
 */
function save() {

	if ( !isValid() ) {
		return false;
	}

	const price = document.getElementById('price');
	const params = {
		title: form.title.value,
		writer: form.writer.value,
		content: form.content.value,
		deleteYn: 'N'
	};

	fetch('/api/boards', {
		method: 'POST',
		headers: {
			'Content-Type': 'application/json',
		},
		body: JSON.stringify(params)

	}).then(response => {
		if (!response.ok) {
			throw new Error('Request failed...');
		}

		alert('저장되었습니다.');
		location.href = '/board/list';

	}).catch(error => {
		alert('오류가 발생하였습니다.');
	});
}
