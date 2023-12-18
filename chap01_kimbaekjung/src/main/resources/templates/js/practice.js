// 게시글의 개수
const totalPosts = 15; // 예시로 15개라고 가정

// 페이지당 게시글 수
const postsPerPage = 10;

// 전체 페이지 수 계산
const totalPages = Math.ceil(totalPosts / postsPerPage);

// 페이지 버튼을 추가하는 함수
function addPageButton(pageNumber) {
    const pageButtonsContainer = document.getElementById('page-buttons-container');
    const button = document.createElement('a');
    button.href = '#'; // 나중에 실제 링크로 변경
    button.className = 'page-button';
    button.textContent = pageNumber;

    // 페이지 버튼 클릭 시 해당 페이지로 이동하는 이벤트 리스너 추가
    button.addEventListener('click', () => {
        // 페이지 이동 로직 추가
        console.log(`Go to page ${pageNumber}`);
    });

    pageButtonsContainer.appendChild(button);
}

// 페이지 버튼을 초기화하는 함수
function initPageButtons() {
    // 페이지 버튼 컨테이너 비우기
    const pageButtonsContainer = document.getElementById('page-buttons-container');
    pageButtonsContainer.innerHTML = '';

    // 페이지가 1개 이상일 때만 버튼 추가
    if (totalPages > 1) {
        for (let i = 1; i <= totalPages; i++) {
            addPageButton(i);
        }
    }
}

// 초기화 함수 호출
initPageButtons();
