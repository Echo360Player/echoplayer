possible P2P sharing of files once downloaded?
fin player to facilitate playback speeds, subtitles, switching video tracks




- features of http request
  - heartbeat
  - 3 distinct filestreams (.m4s container)
    - audio  (MPEG AAC Audio (mp4a))
    - videoA (H264 - MPEG-4 AVC (part 10) (avc1))
    - videoB (H264 - MPEG-4 AVC (part 10) (avc1))
  - subtitles on pageload
    - .vtt format (can be played in VLC)
    - latest

response snippet from `https://echo360.net.au/section/{section_id}/syllabus`:
```json
{
    "status": "ok",
    "message": "",
    "data": [
        {
            "lesson": {
                "lesson": {
                    "id": "bb63dcc5-df5d-4c3c-876b-2b5ddb89b29e",
                    "institutionId": "60d4291f-70de-44d8-a332-d7c51983738d",
                    "sectionId": "613781d9-6dd3-40e5-b1da-e10413835ad0",
                    "name": "Week 1 - LEC1",
                    "timing": {
                        "start": "2023-07-24T08:00:00.000",
                        "end": "2023-07-24T09:00:00.000"
                    },
                    "timeZone": {
                        "id": "Australia/Brisbane",
                        "name": "(+10:00) Australia/Brisbane",
                        "standardOffset": "PT10H"
                    },
                    "fromSchedule": false,
                    "shouldStreamLive": false,
                    "createdAt": "2023-07-23T23:18:20.456Z",
                    "updatedAt": "2023-07-23T23:18:20.456Z",
                    "displayName": "Week 1 - LEC1",
                    "lessonHasName": true
                },
                "medias": [
                    {
                        "id": "0bfb1b5e-c4f2-437c-87bb-2881a514d70f",
                        "mediaType": "Video",
                        "title": "CSSE2010/7201 Lecture",
                        "isAvailable": true,
                        "isHiddenDueToCaptions": false,
                        "isRead": true,
                        "isScheduled": false,
                        "isProcessing": false,
                        "isFailed": false,
                        "isPreliminary": false,
                        "isInteractiveMedia": false,
                        "is360Video": false
                    }
                ],
                "userSectionRole": "Student",
                "questionCount": 0,
                "isScheduled": false,
                "hasContent": true,
                "hasVideo": true,
                "hasVideoHiddenDueToCaptions": false,
                "hasSlideDeck": false,
                "isLive": false,
                "isInteractiveMedia": false,
                "isPast": false,
                "isFuture": true,
                "is360Video": false,
                "startTimeUTC": "2023-07-23T22:00:00.000Z",
                "endTimeUTC": "2023-07-23T23:00:00.000Z"
            },
            "type": "SyllabusLessonType"
        }
}
```

response snippet from `https://echo360.net.au/user/enrollments`:
```json
{
    "status": "ok",
    "message": "",
    "data": [
        {
            "userSections": [{
                    "sectionId": "613781d9-6dd3-40e5-b1da-e10413835ad0",
                    "sectionName": "CSSE2010_STLUC_S2_2023",
                    "lessonCount": 20,
                    "courseId": "58ce9181-167c-4f54-ad7b-fbb7eb2aacd6",
                    "courseCode": "CSSE2010",
                    "courseName": "Intro to Computer Systems",
                    "termId": "d52dc4d9-edf8-4de0-ad12-a33bab0a54ff"
                }
            ],
            "termsById": {
                "d52dc4d9-edf8-4de0-ad12-a33bab0a54ff": {
                    "id": "d52dc4d9-edf8-4de0-ad12-a33bab0a54ff",
                    "name": "TERM-S2 2023",
                    "startDate": "2023-05-29",
                    "isActive": true,
                    "isActiveOrFuture": true
                },
                "ecdefd55-31be-44f2-804b-c4295c0fc5a4": {
                    "id": "ecdefd55-31be-44f2-804b-c4295c0fc5a4",
                    "name": "TERM-S1 2023",
                    "startDate": "2022-12-26",
                    "isActive": false,
                    "isActiveOrFuture": false
                }
            }
        }
    ]
}
```

response snippet from `https://echo360.net.au/media/{media_id}/transcription/latest`:
```json
{
    "status": "ok",
    "message": "",
    "data": [
			"{
				\"cues\":[
					{
						\"start\":2790,
						\"end\":10649,
						\"content\":\"Okay, good afternoon, everyone. Let's get started just ticking my audio for zoom, cause I had a small issue here. Can you guys hear me on zoom.\",
						\"title\":\"1\",
						\"notes\":[],
						\"speaker\":\"Chamith Wijenayake - ITEE plan convener for Electrical & Computer Eng\",
						\"rightToLeft\":false
					},
					{
						\"start\":12160,
						\"end\":20670,
						\"content\":\"Alright. Thank you. Okay. So let's start with the lecture for today. We continue our discussion on\",
						\"title\":\"2\",
						\"notes\":[],
						\"speaker\":\"Chamith Wijenayake - ITEE plan convener for Electrical & Computer Eng\",
						\"rightToLeft\":false
					},
					{
						\"start\":21320,
						\"end\":32409,
						\"content\":\"details about the microprocessor. Right? Details about the CPU. That's what we started last time we talked about the ALU, the arithmetic and logic unit.\",
						\"title\":\"3\",
						\"notes\":[],
						\"speaker\":\"Chamith Wijenayake - ITEE plan convener for Electrical & Computer Eng\",
						\"rightToLeft\":false
					}
				],
				\"notes\":[]
			}"
		]
}
```
`JSON.parse(response.data)` will yield formatted fields as necessary
